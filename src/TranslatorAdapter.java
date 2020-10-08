public class TranslatorAdapter implements VietnameseTarget {
    private EnglishAdapter adapter;

    public TranslatorAdapter(EnglishAdapter adapter) {
        this.adapter = adapter;
    }

    private String translate(String vietnamese){
        System.out.println("Phương thức dịch");
        return "Được dịch sang tiếng anh";
    }

    @Override
    public void send(String word) {
        System.out.println("Doc tu....");
        System.out.println(word);
        String vietnameseWord = this.translate(word);
        adapter.receive(vietnameseWord);
    }


}
