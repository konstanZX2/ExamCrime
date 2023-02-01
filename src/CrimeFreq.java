import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CrimeFreq {

    public static void main(String[] args) throws IOException {
        Map<String, Integer> map = readCSV();
        writeObjects(map);

    }

    private static void writeObjects(Map<String, Integer> map) throws  IOException{
        ObjectOutputStream objectOutputStream = null;
        try{
            objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream("CrimeFreq.dat")));
            for()

        }
        finally{
            if (objectOutputStream != null){
                objectOutputStream.close();
            }
        }
    }

    private static Map<String, Integer> readCSV() throws IOException {
        Map<String, Integer> map = new HashMap<>();
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("Crimes.csv"));
            bufferedReader.readLine();
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] items = line.split(",");
                String crimeDesc = items[5];
                Integer num = map.get(crimeDesc);
                //ESTO ES SI NO EXISTE
              /*  if (num == null) {
                    map.put(crimeDesc, 1);
                } else {
                    map.put(crimeDesc, num + 1);
                }  */
                map.put(crimeDesc, num == null ? 1 : num + 1);

            }
            return map;


        } finally {
            if(bufferedReader != null){
                bufferedReader.close();
            }
        }
    }
}
