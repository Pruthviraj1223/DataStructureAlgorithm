package lucene;//package com.mindarray;
//
//import java.io.*;
//import java.nio.file.Paths;
//import java.util.*;
//
//import com.mindarray.api.settings.SNMPOIDGroup;
//import org.apache.lucene.analysis.core.KeywordAnalyzer;
//import org.apache.lucene.document.Document;
//import org.apache.lucene.document.Field;
//import org.apache.lucene.document.TextField;
//import org.apache.lucene.index.IndexWriter;
//import org.apache.lucene.index.IndexWriterConfig;
//import org.apache.lucene.store.FSDirectory;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
//import org.json.simple.parser.JSONParser;
//
//public class lucene {
//
//    public static final String INDEX_DIR = "/home/pruthviraj/workspace/java-workspace/Motadata/motadata/indices";
//
//    public static void main(String[] args) throws Exception {
//
//        IndexWriter writer = createWriter();
//
//        List<Document> documents = new ArrayList<>();
//
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("/home/pruthviraj/workspace/java-workspace/Motadata/motadata/new_updated.csv"));
//
//        JSONParser jsonParser = new JSONParser();
////
//        var data = (JSONArray) jsonParser.parse(new FileReader("/home/pruthviraj/workspace/java-workspace/Motadata/motadata/db-files/snmp-devices.json"));
//
//        String line;
//
//        int count = 0;
//
//        HashMap<String, String> hashMap = new HashMap<>();
//
//        ArrayList<String> passOver = new ArrayList<>();
//
//        passOver.add("av");
//        passOver.add("psi");
//        passOver.add("pro");
//        passOver.add("switch");
//        passOver.add("rtec");
//        passOver.add("rak");
//        passOver.add("x net");
//        passOver.add("acc");
//        passOver.add("ali");
//        passOver.add("sri");
//        passOver.add("zte");
//
//        ArrayList<String> vendors = new ArrayList<>();
//
//        ArrayList<String> duplicates = new ArrayList<>();
//
//        for (int index = 0; index < data.size(); index++) {
//
//            var key = (String) ((JSONObject) data.get(index)).get("snmp.device.catalog.vendor");
//
//            if (vendors.isEmpty() || !vendors.contains(key)) {
//                vendors.add(key);
//            }
//        }
//
//        ArrayList<String> unique = new ArrayList<>();
//
//        while ((line = bufferedReader.readLine()) != null) {
//
//            if (count != 0) {       // skip the first row
//
//                String[] rows = line.split(",");
//
//                rows[0] = rows[0].replaceAll("\"", "");
//                rows[1] = rows[1].replaceAll("\"", "");
//                rows[2] = rows[2].replaceAll("\"", "");
//                rows[3] = rows[3].replaceAll("\"", "");
//                rows[4] = rows[4].replaceAll("\"", "");
//
//
//                if (rows.length == 6) {
//
//                    if (vendors.contains(rows[0])) {
////                        documents.add(createDocument(row[0],row[1],row[2],row[3],row[4]));
//                    } else {
//                        if (!unique.contains(rows[0]) && !duplicates.contains(rows[0])) {
//
//                            for (int index = 0; index < vendors.size(); index++) {
//
//                                if (!unique.contains(rows[0])) {
//
//                                    if (vendors.get(index).equalsIgnoreCase(rows[0])) {
//                                        break;
//                                    }
//
//                                    if (hashMap.containsKey(vendors.get(index).toLowerCase().concat(" || ").concat(rows[0].toLowerCase()))) {
//                                        break;
//                                    }
//
//                                    if (vendors.get(index).concat(" ").toLowerCase().contains(rows[0].toLowerCase())) {
//                                        hashMap.put(rows[0].toLowerCase(), vendors.get(index).toLowerCase());
//                                        unique.add(rows[0]);
//
//                                    } else if (rows[0].concat(" ").toLowerCase().contains(vendors.get(index).toLowerCase())) {
//                                        hashMap.put(rows[0].toLowerCase(), vendors.get(index).toLowerCase());
//                                        unique.add(rows[0]);
//                                    }
//                                } else {
//                                    break;
//                                }
//                            }
//
//                            duplicates.add(rows[0]);
//                        }
//                    }
//                }
//            }
//            count++;
//        }
//
//        bufferedReader = new BufferedReader(new FileReader("/home/pruthviraj/workspace/java-workspace/Motadata/motadata/new_updated.csv"));
//
//        HashMap<String,String> uniqueOID_NAMES = new HashMap<>();
//
//        uniqueOID_NAMES.put("@!","pruthvi");
//
//        count = 0;
//
//        while ((line = bufferedReader.readLine()) != null) {
//
//            if (count != 0) {       // skip the first row
//
//                String[] rows = line.split(",");
//
//                var key = rows[0].toLowerCase().concat(" || ").concat(rows[1].toLowerCase()).concat("|| ").concat(rows[3].toLowerCase());
//
//                rows[0] = rows[0].replaceAll("\"", "");
//                rows[1] = rows[1].replaceAll("\"", "");
//                rows[2] = rows[2].replaceAll("\"", "");
//                rows[3] = rows[3].replaceAll("\"", "");
//                rows[4] = rows[4].replaceAll("\"", "");
//
//                if (rows.length == 6)
//                {
//                    rows[5] = rows[5].replaceAll("\"", "");
//
//                    if (vendors.contains(rows[0])) {
//
//                        if (!uniqueOID_NAMES.containsKey(key) || (uniqueOID_NAMES.containsKey(key) && !uniqueOID_NAMES.get(key).equalsIgnoreCase(rows[2])))
//                        {
//                            if (rows[3].equalsIgnoreCase("scalar"))
//                            {
//                                System.out.println(Arrays.toString(rows));
//                            }
//
//                            documents.add(createDocumentForParent(rows[0], rows[1].toLowerCase().replaceAll("_", ""), rows[2], rows[3], rows[4],rows[5]));
//                            uniqueOID_NAMES.put(key,rows[2]);
//                        }
//
//                    } else {
//
//                        if (hashMap.containsKey(rows[0].toLowerCase()) && !passOver.contains(rows[0].toLowerCase()) && !passOver.contains(hashMap.get(rows[0].toLowerCase())))
//                        {
//                            if (!uniqueOID_NAMES.containsKey(key) || (uniqueOID_NAMES.containsKey(key) && !uniqueOID_NAMES.get(key).equalsIgnoreCase(rows[2])))
//                            {
//                                if (rows[3].equalsIgnoreCase("scalar"))
//                                {
//                                    System.out.println(Arrays.toString(rows));
//                                }
//
//                                documents.add(createDocumentForParent(hashMap.get(rows[0].toLowerCase()), rows[1].toLowerCase().replaceAll("_", ""), rows[2], rows[3], rows[4],rows[5]));
//
//                                uniqueOID_NAMES.put(key,rows[2]);
//                            }
//                        }
//                    }
//                }
//                else
//                {
//                    if (vendors.contains(rows[0])) {
//
//                        if (!uniqueOID_NAMES.containsKey(key) || (uniqueOID_NAMES.containsKey(key) && !uniqueOID_NAMES.get(key).equalsIgnoreCase(rows[2])))
//                        {
//                            documents.add(createDocument(rows[0], rows[1].toLowerCase().replaceAll("_", ""), rows[2], rows[3], rows[4]));
//                            uniqueOID_NAMES.put(key,rows[2]);
//                        }
//
//                    } else {
//
//                        if (hashMap.containsKey(rows[0].toLowerCase()) && !passOver.contains(rows[0].toLowerCase()) && !passOver.contains(hashMap.get(rows[0].toLowerCase())))
//                        {
//                            if (!uniqueOID_NAMES.containsKey(key) || (uniqueOID_NAMES.containsKey(key) && !uniqueOID_NAMES.get(key).equalsIgnoreCase(rows[2])))
//                            {
//                                documents.add(createDocument(hashMap.get(rows[0].toLowerCase()), rows[1].toLowerCase().replaceAll("_", ""), rows[2], rows[3], rows[4]));
//                                uniqueOID_NAMES.put(key,rows[2]);
//                            }
//                        }
//                    }
//
//                    if (!rows[3].equalsIgnoreCase("scalar"))
//                    {
//                        System.out.println(Arrays.toString(rows));
//                    }
//                }
//            }
//            count++;
//        }
//
//
//        //Let's clean everything first
//        writer.deleteAll();
//
//        writer.addDocuments(documents);
//        writer.commit();
//        writer.close();
//
//
//        System.out.println("closed with " + count + " records " + " unique " + unique);
//
//    }
//
//    private static Document createDocument(String vendor, String counterName, String oid, String type, String parentOID) {
//
//        Document document = new Document();
//
//        document.add(new TextField(SNMPOIDGroup.OID_NAME, counterName.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField(SNMPOIDGroup.VENDOR, vendor.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField(SNMPOIDGroup.OID, oid.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField(SNMPOIDGroup.OID_TYPE, type.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField(SNMPOIDGroup.PARENT_OID, parentOID.toLowerCase().trim(), Field.Store.YES));
//        return document;
//    }
//
//    private static Document createDocumentForParent(String vendor, String counterName, String oid, String type, String parentOID,String parentName) {
//
//        Document document = new Document();
//
//        document.add(new TextField(SNMPOIDGroup.OID_NAME, counterName.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField(SNMPOIDGroup.VENDOR, vendor.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField(SNMPOIDGroup.OID, oid.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField(SNMPOIDGroup.OID_TYPE, type.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField(SNMPOIDGroup.PARENT_OID, parentOID.toLowerCase().trim(), Field.Store.YES));
//        document.add(new TextField("parent.name", parentName.toLowerCase().trim(), Field.Store.YES));
//        return document;
//    }
//
//    private static IndexWriter createWriter() throws IOException {
//
//        FSDirectory dir = FSDirectory.open(Paths.get(INDEX_DIR));
//
//        IndexWriterConfig config = new IndexWriterConfig(new KeywordAnalyzer());
//
//        return new IndexWriter(dir, config);
//    }
//}
