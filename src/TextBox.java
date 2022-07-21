public abstract class TextBox  {
    public String text;
    private int y;
    private int x;

    public TextBox(int y, int x) {
        this.y = y;
        this.x = x;
    }
    public void render(){

    }
    public void addText(String text) {
        String ip=findipaddress(text);
        this.text = text;
    }

    private String findipaddress(String text) {
        return "1234566";
    }

    public void deleteText() {

    }

    @Override
    public String toString() {
        return text;
    }

    public TextBox() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
