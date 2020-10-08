import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class HelloWorld_PasteBinApi {
    //args = [0] api key, after: +Format=(format), +Visibility=(0,1,2)
    public static void main(String[] args) {
        if (args.length > 0) {
            String key = args[0];
            int vis = 1;
            String format = null;
            for (String s : args) {
                if (s.startsWith("+")) {
                    String type = s.substring(1, s.indexOf("="));
                    if (type.equalsIgnoreCase("Format")) {
                        format = s.split("=")[1];
                    }
                    if (type.equalsIgnoreCase("Visibility")) {
                        vis = Integer.parseInt(s.split("=")[1]);
                    }
                }
            }
            System.out.println("Creating paste...");
            Paste p = new Paste(key, "HelloWorld", "Hello, world!", vis, format);
            try {
                System.out.println("Paste link: " + p.paste());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Please put your api key as the first arg!");
        }
    }
    private static final class Paste {
        private static final String POST_LINK = "https://pastebin.com/api/api_post.php";
        private final String KEY;
        private final String TITLE;
        private final String CONTENT;
        private final int VISIBILITY;
        private final String FORMAT;
        public Paste(String apiKey, String title, String content, int visibility) {
            this(apiKey, title, content, visibility, null);
        }
        public Paste(String apiKey, String title, String content, int visibility, String format) {
            KEY=apiKey;
            TITLE=title;
            CONTENT=content;
            VISIBILITY=visibility;
            FORMAT=format;
        }
        public String paste() throws Exception {
            if (CONTENT == null || CONTENT.isEmpty()) {
                throw new IllegalStateException("Invalid content!");
            }
            if (KEY == null || KEY.isEmpty()) {
                throw new IllegalStateException("Invalid api key!");
            }
            PostRequest request = new PostRequest();
            request.addArgs("api_dev_key", KEY);
            request.addArgs("api_option", "paste");
            request.addArgs("api_paste_code", CONTENT);

            if (TITLE != null && !TITLE.isEmpty()) {
                request.addArgs("api_paste_name", TITLE);
            }
            if (FORMAT != null && !FORMAT.isEmpty()) {
                request.addArgs("api_paste_format", FORMAT);
            }
            request.addArgs("api_paste_private", Integer.toString(VISIBILITY));
            String response = request(request);
            if (response != null) {
                return response;
            }
            return null;
        }

        private static String request(PostRequest req) {
            try {
                URL url = new URL(Paste.POST_LINK);
                URLConnection connection = url.openConnection();
                if (req != null) {
                    connection.setDoOutput(true);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(connection.getOutputStream());
                    outputStreamWriter.write(req.getPost());
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                }
                BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                StringBuilder builder = new StringBuilder();
                String ln;
                while ((ln = reader.readLine()) != null) {
                    if (builder.length() > 0) {
                        builder.append("\n");
                    }
                    builder.append(ln);
                }
                reader.close();
                return builder.toString();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

    }
    private static final class PostRequest {
        private static final Charset ENCODE = StandardCharsets.UTF_8;
        private final Map<String, String> post = new HashMap();

        public void addArgs(String k, String val) {
            post.put(URLEncoder.encode(k, ENCODE), URLEncoder.encode(val, ENCODE));
        }
        public String getPost() {
            StringBuilder builder = new StringBuilder();
            for (Map.Entry<String, String> entry : post.entrySet()) {
                builder.append(entry.getKey()).append('=').append(entry.getValue()).append('&');
            }
            builder.deleteCharAt(builder.length() - 1);
            return builder.toString();
        }

    }

}
