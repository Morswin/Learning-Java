public class Kontener02 {
    public static void main(String[] args) {

    }

    private Object[] tab;
    private int size;

    public Kontener02(int size) {
        this.tab = new Object[size];
        this.size = size;
    }

    public Object get(int index) {
        if (index >= 0 && index < this.tab.length) {
            return this.tab[index];
        }
        throw new IndexOutOfBoundsException("Attempted to access an index out of bounds");
    }
    public void set(int index, Object value) {
        if (index >= 0 && index < this.tab.length) {
            this.tab[index] = value;
        }
        else if (index >= this.tab.length) {
            this.setSize(index + 1);
            this.tab[index] = value;
        }
        throw new IndexOutOfBoundsException("Attempted to access an index out of bounds");
    }

    public Object[] getTab() {
        return this.tab;
    }
    public void setTab(Object[] tab) {
        this.tab = tab;
        this.size = tab.length;
    }
    public int getSize() {
        return this.size;
    }
    public void setSize(int size) {
        Object[] newTab = new Object[size];
        if (newTab.length < this.size) {
            // We're loosing some data from old table
            for (int i = 0; i < newTab.length; i++) {
                newTab[i] = this.tab[i];
            }
            this.tab = newTab;
        }
        else {
            // We're assigning some empty data to new one
            for (int i = 0; i < this.tab.length; i++) {
                newTab[i] = this.tab[i];
            }
            this.tab = newTab;
        }
    }
}
