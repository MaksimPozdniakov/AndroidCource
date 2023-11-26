package Study.Architecture.Seminars.Seminar_01.Ex_home_work.ModelElements;

import java.util.ArrayList;
import java.util.Collection;

public class PoligonalModel {

    private Collection<Poligon> poligons = new ArrayList<>();

    private Collection<Texture> textures = new ArrayList<>();

    public Collection<Poligon> getPoligons() {
        return poligons;
    }

    public Collection<Texture> getTextures() {
        return textures;
    }
}
