package inner_class;

public enum enum_ch {
    SAVINGS,CURRENT,DEMAT,LOAN;

    public String toString(){
        return super.name().toLowerCase();
    }
}
