package DOM;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;

import Operate.saveData;

public class DOM4User {
	public static List<User> getUsers(String Path) throws Exception{
		InputStream inputStream = new FileInputStream(new File(Path));
		List<User> list = new ArrayList<User>();
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document document = builder.parse(inputStream);
		Element element = document.getDocumentElement();
		
		NodeList UserNodes = element.getElementsByTagName("User");
		for(int i=0;i<UserNodes.getLength();i++){
			Element UserElement = (Element) UserNodes.item(i);
			User User = new User();
			User.setId(Integer.parseInt(UserElement.getAttribute("id")));
			NodeList childNodes = UserElement.getChildNodes();
//			System.out.println("*****"+childNodes.getLength());
			for(int j=0;j<childNodes.getLength();j++){
				if(childNodes.item(j).getNodeType()==Node.ELEMENT_NODE){
					if("name".equals(childNodes.item(j).getNodeName())){
						User.setName(childNodes.item(j).getFirstChild().getNodeValue());
					}else if("pwd".equals(childNodes.item(j).getNodeName())){
						User.setPwd(childNodes.item(j).getFirstChild().getNodeValue());
					}else if ("date".equals(childNodes.item(j).getNodeName())) {
						User.setTime(childNodes.item(j).getFirstChild().getNodeValue());
					}
					
				}
			}//end for j
			list.add(User);
		}//end for i
		return list;
	}
	public static void insertUser(User in) {
		saveData save = new saveData();
		save.insertData(in);
	}
	public static void main(String[] args) {
		try {
			List<User> list = getUsers("H:/students.xml");
			System.out.println("22");
			User we = new User("itas", "321".hashCode()+"", "11");
			insertUser(we);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}