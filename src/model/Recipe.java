package model;

import java.util.Arrays;

public class Recipe {
	private int Id;
	private String Name;
	private String[] zairyou;
	private String[] tyoumiryou;
	private String ImgId;
	@Override
	public String toString() {
		return "Recipe [Id=" + Id + ", Name=" + Name + ", zairyou=" + Arrays.toString(zairyou) + ", tyoumiryou="
				+ Arrays.toString(tyoumiryou) + ", ImgId=" + ImgId + "]";
	}
	public String getImgId() {
		return ImgId;
	}
	public void setImgId(String imgId) {
		ImgId = imgId;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String[] getZairyou() {
		return zairyou;
	}
	public void setZairyou(String[] zairyou) {
		this.zairyou = zairyou;
	}
	public String[] getTyoumiryou() {
		return tyoumiryou;
	}
	public void setTyoumiryou(String[] tyoumiryou) {
		this.tyoumiryou = tyoumiryou;
	}
	
	
}
