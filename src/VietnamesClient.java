public class VietnamesClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new EnglishAdapter());
        client.send("Xin chao");
    }
}
