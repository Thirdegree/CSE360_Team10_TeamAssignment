import menus.*;

public class testing {

	public static void main (String[] args){
		GameWindow gw = new GameWindow();
		MainMenu mainMenu = new MainMenu();
		gw.updateWindowContent(mainMenu.getFormPanel());
		
		//if (loginForm.isUserIsNew()){
		//	Profile profileForm = new Profile();
		//	gw.updateWindowContent(profileForm.getFormPanel());
		//} else {
		//	
		//}
		
	}
}
