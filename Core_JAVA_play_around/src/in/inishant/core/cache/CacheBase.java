/**
 * 
 */
package in.inishant.core.cache;

import java.util.Date;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author nishant.awasthi1
 *
 */
public class CacheBase {
	class CacheEntry {
//		TimerTa
		public CacheEntry(String val) {
			value=val;
		}
		Date date=new Date();
		String value;
		
		
		
	}
	
	class CacheCleaner implements Runnable{
		
		
		@Override
		public void run() {
			while(true){
				Set<String> set=map.keySet();
				for (String string : set) {
					//remove based on timestamp
				}
				
				//sleep current thread for n mins
			}
		}
		
	}
	
	private CacheBase() {
		//create thread and remove for last 2 hours
		Thread th= new Thread(new CacheCleaner());
		th.start();
	}

	static CacheBase cb;
	static CacheBase getInstance(){
		if(cb==null){
			synchronized(CacheBase.class){
				if(cb==null) cb=new CacheBase();
			}
		}
		return cb;
	}
	Map<String,CacheEntry> map=new ConcurrentHashMap<>();

	
	
	String get(String key){
		return map.get(key)==null?null:map.get(key).value;
	}
	
	
	void add(String key,String val){
		
	}
	
	void remove(String key){
		
	}
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
