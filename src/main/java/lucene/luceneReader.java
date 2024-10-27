package lucene;//package com.mindarray;
//
//import java.io.IOException;
//import java.nio.file.Paths;
//
//import com.mindarray.api.settings.SNMPOIDGroup;
//import org.apache.lucene.analysis.core.KeywordAnalyzer;
//import org.apache.lucene.analysis.standard.StandardAnalyzer;
//import org.apache.lucene.document.Document;
//import org.apache.lucene.index.DirectoryReader;
//import org.apache.lucene.index.IndexReader;
//import org.apache.lucene.index.Term;
//import org.apache.lucene.queryparser.classic.QueryParser;
//import org.apache.lucene.search.*;
//import org.apache.lucene.store.Directory;
//import org.apache.lucene.store.FSDirectory;
//
//public class luceneReader
//{
//
//    public static void main(String[] args) throws Exception
//    {
//        IndexSearcher searcher = createSearcher();
//
//        String vendor = "Hewlett Packard Enterprise";
//
//        String type = "scalar";
//
//        String counterName = "cpu";
//
//        var cl1 = new BooleanClause(new TermQuery(new Term(SNMPOIDGroup.VENDOR,vendor)), BooleanClause.Occur.SHOULD);
//
//        var cl2 = new BooleanClause(new TermQuery(new Term(SNMPOIDGroup.OID_TYPE,type)), BooleanClause.Occur.MUST);
//
//        var booleanQuery = new BooleanQuery.Builder();
//
//        booleanQuery.add(cl1);
//
//        String name="";
//
//        var tokens = vendor.split(" ");
//
//        for (int index = 0; index < vendor.split(" ").length; index++) {
//
//            name = name.concat("+").concat(tokens[index]).concat(" ");
//
//        }
//
//        name = name.trim();
//
//        var query = "(+"+ SNMPOIDGroup.VENDOR + ":(" + name.toLowerCase().trim() + ") AND +" + SNMPOIDGroup.OID_NAME + ":(*" + counterName.toLowerCase().trim() + "*))";
//
//        TopDocs foundDocs = searchByVendor("(+vendor:(3com corporation) AND +oid.name:(*memory*))",searcher);
//
//        System.out.println("Total Results :: " + foundDocs.totalHits);
//
//        for (ScoreDoc sd : foundDocs.scoreDocs)
//        {
//            Document document = searcher.doc(sd.doc);
//            System.out.println("vendor : " + document.get(SNMPOIDGroup.VENDOR)+ " type " + document.get(SNMPOIDGroup.OID_TYPE) +  " counter name " + document.get(SNMPOIDGroup.OID_NAME));
//        }
//
//    }
//
//    private static TopDocs searchByVendor(String s, IndexSearcher searcher) throws Exception
//    {
//        QueryParser queryParser = new QueryParser(s.toLowerCase().trim(), new KeywordAnalyzer());
//
//        queryParser.setAllowLeadingWildcard(true);
//
//        Query firstNameQuery = queryParser.parse(s.toLowerCase().trim());
//
//        System.out.println("query : " + s + " white space " + queryParser.getSplitOnWhitespace());
//
//        return searcher.search(firstNameQuery, 500);
//    }
//
//    private static IndexSearcher createSearcher() throws IOException {
//
//        //                var cl1 = new BooleanClause(new TermQuery(new Term(lucene.VENDOR,vendor)), BooleanClause.Occur.SHOULD);
////
////                var cl2 = new BooleanClause(new TermQuery(new Term(lucene.COUNTER_NAME,counterName)), BooleanClause.Occur.SHOULD);
////
////                var booleanQuery = new BooleanQuery.Builder();
////
////                booleanQuery.add(cl1).add(cl2);
//
////        Directory dir = FSDirectory.open(Paths.get(lucene.INDEX_DIR));
////        IndexReader reader = DirectoryReader.open(dir);
////        return new IndexSearcher(reader);
//
//    }
//}