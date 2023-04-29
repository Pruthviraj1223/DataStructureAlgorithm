//package Lucene;
//
//import com.opencsv.CSVWriter;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.FileWriter;
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.List;
//
//public class updateCSV {
//
//    public static String[] copy(String[] arr)
//    {
//        String[] new_arr = new String[arr.length+1];
//
//        System.arraycopy(arr, 0, new_arr, 0, arr.length);
//        return new_arr;
//    }
//
//    public static String[] copy2(String[] arr)
//    {
//        String[] new_arr = new String[arr.length+1];
//
//        System.arraycopy(arr, 0, new_arr, 0, arr.length-1);
//
//        return new_arr;
//    }
//
//    public static void main(String[] args) throws Exception {
//
//        CSVWriter writer = new CSVWriter(new FileWriter("/home/pruthviraj/workspace/java-workspace/Motadata/motadata/new_updated.csv"));
//
//        List<String[]> records = new ArrayList<>();
//
//        String[] header = new String[6];
//        header[0] = "vendor";
//        header[1] = "oid.name";
//        header[2] = "counter.oid";
//        header[3] = "oid.type";
//        header[4] = "parent.oid";
//        header[5] = "parent.name";
//
//        records.add(header);
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/pruthviraj/default_snmp_metrics.csv"));
//
//        String line;
//
//        int count=0;
//
//        HashMap<String,String> parents = new HashMap<>();
//
//        while ((line= bufferedReader.readLine())!=null)
//        {
//            var rows = line.split(",");
//
//            if (count!=0) {
//
//                if (rows.length == 5) {
//
//                    String[] new_rows = copy(rows);
//
//                    if (rows[3].equalsIgnoreCase("tabular")) {
//
//                        if (rows[2].equalsIgnoreCase(rows[4])) {
//                            parents.put(rows[2].toLowerCase(), rows[1].toLowerCase());
//                        }
//
//                        new_rows[new_rows.length-1] = parents.get(rows[4].toLowerCase());
//                    }
//
//                    records.add(new_rows);
//                }
//                else if (rows.length == 6)
//                {
//                    rows[0] = rows[0].concat(rows[1]);
//                    rows[1] = rows[2];
//                    rows[2] = rows[3];
//                    rows[3] = rows[4];
//                    rows[4] = rows[5];
//
//                    String[] new_rows = copy2(rows);
//
//                    if (rows[3].equalsIgnoreCase("tabular")) {
//
//                        if (rows[2].equalsIgnoreCase(rows[4])) {
//                            parents.put(rows[2].toLowerCase(), rows[1].toLowerCase());
//                        }
//
//                        new_rows[new_rows.length-2] = parents.get(rows[4].toLowerCase());
//                    }
//
//                    records.add(new_rows);
//                }
//            }
//            count++;
//        }
//
//        writer.writeAll(records);
//
//        writer.flush();
//
//        writer.close();
//
//        System.out.println("Data entered");
//    }
//}
