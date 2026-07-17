package desktopgame.ashendawn.game;

import com.jme3.app.SimpleApplication;

import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.InputStream;



public class mapCreation extends SimpleApplication {
    public String[] buildingsSpaceKit = {};
    public String[] buildingsFantasyKit = new  String[6];
    public String[] buildingsCityKit = new  String[6];
    private final Map<String,String> spaceKitMap = new  HashMap<String,String>();
    public final String[][] myMap = new String[25][25];

    public void mapAlgorithm(){

    }

    public void createSpaceMap(){

    }
    public void createFantasyMap(){

    }
    public void createCityMap(){

    }
    public void createDistortedMap(){

    }


    public void addStufftoMapHashMap(String name){
        InputStream in = getClass().getClassLoader().getResourceAsStream(name);
        try {
            if (in != null) {
                BufferedReader br = new BufferedReader(new InputStreamReader(in));
                String nameLine;
                while ((nameLine = br.readLine()) != null) {
                    if (nameLine.endsWith(".glb") ||  nameLine.endsWith(".gltf")) {
                        String fullPath = name + "/" + nameLine;
                        spaceKitMap.put(name, fullPath);
                    }
                }
                br.close();
                in.close();
            }
        } catch (Exception e) {
            System.err.println(e);
        }

    }

    @Override
    public void simpleInitApp() {
        addStufftoMapHashMap("Models");
    }

}
