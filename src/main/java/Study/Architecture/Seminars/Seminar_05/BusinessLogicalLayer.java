package Study.Architecture.Seminars.Seminar_05;

import java.util.Collection;

public interface BusinessLogicalLayer {

    Collection<Model3D> getAllModels();
    Collection<Texture> getAllTextures();
    void renderModel(Model3D model);
    void renderAllModels();

}
