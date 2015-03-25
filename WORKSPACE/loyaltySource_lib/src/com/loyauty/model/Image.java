package com.loyauty.model;

import java.awt.Dimension;
import java.io.File;
import java.io.IOException;
import java.util.Date;

import lombok.Data;
import lombok.NonNull;
import lombok.ToString;

import com.loyauty.enums.Type;
import com.loyauty.util.io.FileUtils;
/**
 * 
 */
@Data@ToString(callSuper=true)
public class Image extends AbstractEntity{

	private static final int CONSTANT_DPI = 96;
	private String name;
	private Type type;
	private Long size;
	private Integer height;
	private Integer width;
	private boolean large;
	private Date uploadDate;
	private Integer resolution;
	private Integer score;
	private String realNameImg;
	
	@NonNull
	private Long uploaderId;

	public Image(){}
	
	public void addImageJps(File file,String normalizedName, String realName) throws IOException{
		setName(normalizedName);
		setSize(FileUtils.getFileSize(file));
		Dimension dim = FileUtils.getJPEGDimension(file);
		setHeight(dim.height);
		setWidth(dim.width);
		int res=FileUtils.getJPEGResolution(file);
		setResolution(resolutionDesicion(res));
		setScore(mathematicalFormula());
		setRealNameImg(realName);
	}
	public void addImagePNG(File file,String normalizedName, String realName) throws IOException {
		setName(normalizedName);
		setSize(FileUtils.getFileSize(file));
		Dimension dim = FileUtils.getPNGDimension(file);//TODO faire ce lui
		setHeight(dim.height);
		setWidth(dim.width);
		int res=FileUtils.getPNGResolution(file);//TODO faire ce lui
		setResolution(resolutionDesicion(res));
		setScore(mathematicalFormula());
		setRealNameImg(realName);
	}
	
	/**
	 *Example 1 : image of 2000 X 1500 pixels 150 dpi
	 *mathematical Formula : (2000 +1500) X (150/96) = 7292
	 *@return
	 */
	private int mathematicalFormula(){
		int h=height;
		int w=width;
		int r=resolution;
		int score = (h+w)*r/CONSTANT_DPI;
		return score;
	}
	/**
	 * What to do if the resolution could not been read.
	 * @param resolution
	 * @return
	 */
	private int resolutionDesicion(int resolution){
		if (resolution==0) {
			return CONSTANT_DPI;
		}
		return resolution;
	}


	
}
