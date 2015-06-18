package ch;
import java.io.File;
import java.util.HashMap;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException; 

public class Mapper{

    //public static void main (String argv []){
	public static HashMap<String, String> mapper(){
    	long et,st;
    	st=System.currentTimeMillis();
    	HashMap<String,String> map=new HashMap<String,String>();
    try {

            DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docBuilderFactory.newDocumentBuilder();
            Document doc = docBuilder.parse (new File("c:\\process\\reports.xml"));

            // normalize text representation
            doc.getDocumentElement ().normalize ();
           // System.out.println ("Root element of the doc is " + 
            //     doc.getDocumentElement().getNodeName());


            NodeList listOfPayors = doc.getElementsByTagName("PAYOR");
            //int totalPayer = listOfPayors.getLength();
           // System.out.println("Total no of payers : " + totalPersons);

            for(int s=0; s<listOfPayors.getLength() ; s++){


                Node firstPayerNode = listOfPayors.item(s);
                if(firstPayerNode.getNodeType() == Node.ELEMENT_NODE){
                	

                    Element firstPayerElement = (Element)firstPayerNode;
                    
                    NodeList typeList = firstPayerElement.getElementsByTagName("Type");
                    Element typeElement = (Element)typeList.item(0);

                    NodeList texttypeList = typeElement.getChildNodes();
                  //  System.out.println("Type : " + 
                  //         ((Node)texttypeList.item(0)).getNodeValue().trim());

                
                    //-------
                    NodeList PathList = firstPayerElement.getElementsByTagName("Path");
                    Element PathElement = (Element)PathList.item(0);

                    NodeList textPathList = PathElement.getChildNodes();
                  // System.out.println("File Directory : " + 
                    //       ((Node)textFNList.item(0)).getNodeValue().trim());

                    //-------
                    NodeList FileNameList = firstPayerElement.getElementsByTagName("FileName");
                    Element FileNameElement = (Element)FileNameList.item(0);

                    NodeList textFileList = FileNameElement.getChildNodes();
                   // System.out.println("FileName : " + 
                     //      ((Node)textLNList.item(0)).getNodeValue().trim());

                    //----
                   //------
                    map.put(((Node)textPathList.item(0)).getNodeValue().trim(),((Node)texttypeList.item(0)).getNodeValue().trim()+" "+((Node)textFileList.item(0)).getNodeValue().trim());

                }//end of if clause


            }//end of for loop with s var


        }catch (SAXParseException err) {
        System.out.println ("** Parsing error" + ", line " 
             + err.getLineNumber () + ", uri " + err.getSystemId ());
        System.out.println(" " + err.getMessage ());

        }catch (SAXException e) {
        Exception x = e.getException ();
        ((x == null) ? e : x).printStackTrace ();

        }catch (Throwable t) {
        t.printStackTrace ();
        }
        //System.exit (0);
     /*   for(String k:map.keySet()){
        	System.out.println(k+" "+map.get(k));
        }*/
        return map;
       // et=System.currentTimeMillis();
       // System.out.printf("Total time taken : %d",(et-st));
    }//end of main


}