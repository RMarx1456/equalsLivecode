package io.github.auberonedu.equalsLivecode;

public class Centroid {
    private int r;
    private int c;
    private String name;
    
    public Centroid(int r, int c, String name) {
        this.r = r;
        this.c = c;
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        boolean RET = true;
        if(o == null) {
            return false;
        }
        if(getClass() != o.getClass()) {
            return false;
        }
        Centroid other = (Centroid) o;
        if(r != other.r) {
            return false;
        }
        if(c != other.c) {
            return false;
        }
        if(name == null) {
            if(other.name == null) { return RET;}
            else if(other.name != null){return false;}
        }
        if(!name.equals(other.name)) {
            return false;
        }

        return RET;
    }
}
