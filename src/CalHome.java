import android.content.Intent;
import edu.ucuccs.bsitcalculator.R;


public class CalHome<Bundle> extends activity_main {
	
	public void onPause1() {
		// TODO Auto-generated method stub
		}

		public void onCreate(activity_main savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
		  setContentView(R.layout.activity_main);
		
		Thread th = new Thread(){
			public void run(){
				try{
					sleep(1000);
				}
				catch(Exception e){
					e.printStackTrace();
				}
				finally{
					onPause1();
					activity_main(new Intent("com.one.slate.CALC"));
					
				}
			}

			private void activity_main(Intent intent) {
				// TODO Auto-generated method stub
				
			}
		};
		th.start();
				}
	 private void setContentView(int activityMain) {
		// TODO Auto-generated method stub
		
	}
	@Override
	 public void onPause(){
		 super.onPause();
		 finish();
			}
	private void finish() {
		// TODO Auto-generated method stub
		
	}
	
	

}
