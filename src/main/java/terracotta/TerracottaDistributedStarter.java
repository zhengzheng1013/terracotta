package terracotta;

import com.tc.server.TCServerMain;

public class TerracottaDistributedStarter {
	// -f tc-config_distributed.xml -n server_39510
	public static void main(String[] args) {
		String[] newArgs = {"-f", "tc-config_distributed.xml","-n","server_39510"};
		System.setProperty("com.tc.productkey.resource.path", "terracotta-license.key");
//		System.setProperty("com.tc.productkey.path", "D:/resources/terracotta-license.key");
		
		TCServerMain.main(newArgs);
	}
}
