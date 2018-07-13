package harvey.ggc.edu.newmusicapp;

public class Artist {

    private String mSongName;
    private String mArtistName;
   // private Integer mImgId;
    //need to add image later



public Artist(String songName, String artistName){
    mSongName = songName;
    mArtistName = artistName;
   // mImgId = ImgId;

}

  public String getSongName(){
    return mSongName;
  }

  public String getArtistName(){
    return mArtistName;
  }





}