package inlamningsuppgift;

public class WordCounter {

    private int rows;
    private int characters;
    private boolean getStop;

    public WordCounter() {
        characters = 0;
        rows = 0;
        getStop = false;
    }

    public int getRows() {
        return rows;
    }

    public void addRows() {
        rows++;
    }

    public int getCharacters() {
        return characters;
    }

    public void addCharacters(String inputText) {
        characters = characters + inputText.length();
    }

    public boolean isGetStop() {
        return getStop;
    }

    public void isStopped(String inputText) {
        if (inputText.equals("stop")) {
            getStop = true;
        }
    }

}
