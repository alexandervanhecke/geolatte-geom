package org.geolatte.geom.json;

import org.geolatte.geom.C2D;
import org.geolatte.geom.C3D;
import org.geolatte.geom.C3DM;
import org.geolatte.geom.G3D;
import org.geolatte.geom.crs.CoordinateReferenceSystem;
import org.geolatte.geom.crs.CrsRegistry;
import org.geolatte.geom.crs.LinearUnit;

import static org.geolatte.geom.crs.CoordinateReferenceSystems.*;

/**
 * Created by Karel Maesen, Geovise BVBA on 09/09/17.
 */
public class Crss {


    static CoordinateReferenceSystem<G3D> wgs3D = addVerticalSystem(
            WGS84, G3D.class, LinearUnit.METER
    );

    static CoordinateReferenceSystem<C2D> lambert72 = CrsRegistry.getProjectedCoordinateReferenceSystemForEPSG(31370);
    static CoordinateReferenceSystem<C3D> lambert72Z = addVerticalSystem(lambert72, C3D.class, LinearUnit.METER);
    static CoordinateReferenceSystem<C3DM> lambert72ZM = addLinearSystem(lambert72Z, C3DM.class, LinearUnit.METER);
}
