package CrickApp_Admin;

import javax.swing.JOptionPane;

public class updatePlayer {
	public static int UpdatePlayer(int a[],int c[],int d[],double r[]) {
		try{
			for(int i=1;i<a.length;i++) {
				if(a[i]==0) {
					break;
				}
				String Q2="update player set season_score=season_score+"+c[i]+" where pid="+a[i]+";";
				String Q3="update player set season_wicket=season_wicket+"+d[i]+" where pid="+a[i]+";";
				String Q4="update player set SR=(SR+"+r[i]+")/2 where pid="+a[i]+";";
				
				int x=Database.update(Q2);
				int y=Database.update(Q3);
				int z=Database.update(Q4);
		
			}	
			return 1;
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, e);
			return 0;
		}
		
	}

}
