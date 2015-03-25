package com.loyauty.service.core.dto;

import java.io.File;

import lombok.Data;
import lombok.ToString;


/**
 * 
 * @author Manuel
 *
 */

@Data@ToString(callSuper=true)
public class ImageDTO extends BasicDTO {
      private static final long serialVersionUID = -2983104538804733404L;


      public static ImageDTO valueOf(long imageId, String name, 
                  long size, int height, int width,int resolution, boolean large, String realName, int score){
            return new ImageDTO(imageId, name, size, height, width, resolution,large,realName, score);
      }     
      
      public static ImageDTO valueOf(File file, String name, String realName){
        return new ImageDTO(file, name, realName);
      }   
      
      private String name;    
      private long size;
      private int height;
      private int width;
      private boolean large;
      private int resolution; 
      private String realName;
      private int score;
      private File file;
      
      private ImageDTO(File file, String name, String realName){
            setFile(file);
            setName(name);
            setRealName(realName);
      }
      
      private ImageDTO(long imageId, String name, 
              long size, int height, int width,int resolution, boolean large,String realName, int score){
        setId(imageId);
        setName(name);
        setSize(size);
        setHeight(height);
        setWidth(width);
        setLarge(large);
        setResolution(resolution);
        setRealName(realName);
        setScore(score);
  }

}
      
