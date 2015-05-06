package Operate;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

import DOM.User;
public class saveData {

	/**
	 * @param args
	 */
	    
	 
	/**
	     * 将Document对象修改后写入到xml里面
	     * @param document Document对象
	     * @param filename xml文件路径
	     * @return
	     */
	    public static boolean doc2XmlFile(Document document, String filename) {
	        boolean flag = true;
	        try {
	            /** 将document中的内容写入文件中 */
	            TransformerFactory tFactory = TransformerFactory.newInstance();
	            Transformer transformer = tFactory.newTransformer();
	            /** 编码 */
	            transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
	            DOMSource source = new DOMSource(document);
	            StreamResult result = new StreamResult(new File(filename));
	            transformer.transform(source, result);
	        } catch (Exception ex) {
	            flag = false;
	            System.out.println("更新" + filename + "出错：" + ex);
	           // log.error("更新" + filename + "出错：" + ex);
	            ex.printStackTrace();
	        }
	        return flag;
	    }
	    /*
	     * 
	     * 
	     */
	    public void insertData(User in) {
	    	DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
	    	try {
	            DocumentBuilder db = dbf.newDocumentBuilder();
	            Document doc = db.parse("H:/students.xml");
	 
	            Node stNode = doc.getElementsByTagName("Users").item(0);
	            System.out.println(stNode.getChildNodes().getLength());;
	            Element user = doc.createElement("User");
	    		//step6:为该节点设定属性
	    		user.setAttribute("id", stNode.getChildNodes().getLength()+1+"");
	    		Element name = doc.createElement("name");
	    		//为节点设定文本内容
	    		name.setTextContent(in.getName());
	    		Element pwd = doc.createElement("pwd");
	    		pwd.setTextContent(in.getPwd());
	    		Element time = doc.createElement("date");
	    		time.setTextContent(in.getTime());
	    		user.appendChild(name);
	    		user.appendChild(pwd);
	    		user.appendChild(time);
	    		stNode.appendChild(user);
	            doc2XmlFile(doc, "H:/students.xml");
	        } catch (ParserConfigurationException e) {
	            e.printStackTrace();
	        } catch (SAXException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
}


