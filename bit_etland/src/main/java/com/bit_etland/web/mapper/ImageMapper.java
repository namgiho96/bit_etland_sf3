package com.bit_etland.web.mapper;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;
@Repository
public interface ImageMapper {

	public void insertImage(ImageDTO img);

	public ImageDTO selectimage(ImageDTO img);

	public List<ImageDTO> selectimageLists(Proxy pxy);

	public ImageDTO retriveimage(ImageDTO img);
	
	public String lastImageSeq();

	public int countImage(Proxy pxy);
	
	public void updateImage(ImageDTO img);

	public void removeImage(ImageDTO img);
}
