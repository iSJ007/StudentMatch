
public class Preference {
       int quiteTime, music, reading, chatting;
       
       public Preference (int quitetime, int music, int reading, int chatting) {
    	   this.quiteTime=quitetime;
    	   this.music=music;
    	   this.reading=reading;
    	   this.chatting=chatting;
       }
          
       public int setquiteTime() { 
   		return quiteTime;
   	}

   	public int setmusic() { 
   		return music;
   	}

   	public int setreading() { 
   		return reading;
   	}

   	public int setchatting() { 
   		return chatting;
   	}

   	public int compare(Preference pref) {
   		return (Math.abs(quiteTime - pref.quiteTime) + (Math.abs(music - pref.music)) + 
   		(Math.abs(reading - pref.reading)) +(Math.abs(chatting - pref.chatting)));
   	}
}