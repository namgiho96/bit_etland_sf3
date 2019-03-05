package com.bit_etland.web.service;

import java.util.List;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.proxy.Proxy;

public interface ImageService {
	public void addImage(ImageDTO img);

	public ImageDTO selectimage(ImageDTO img);

	public List<ImageDTO> imageLists(Proxy pxy);

	public ImageDTO retriveimage(ImageDTO img);

	public int countImage(Proxy pxy);
	
	public void updateImage(ImageDTO img);

	public void removeImage(ImageDTO img);
}
