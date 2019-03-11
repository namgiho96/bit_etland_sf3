package com.bit_etland.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bit_etland.web.domain.ImageDTO;
import com.bit_etland.web.mapper.ImageMapper;
import com.bit_etland.web.proxy.Proxy;
@Service
public class ImageServiceImpl implements ImageService{
	@Autowired ImageMapper imageMapper;
	@Override
	public void addImage(ImageDTO img) {
	
		
	}

	@Override
	public ImageDTO selectimage(ImageDTO img) {
	
		return imageMapper.selectimage(img);
	}

	@Override
	public List<ImageDTO> imageLists(Proxy pxy) {
	
		return null;
	}

	@Override
	public ImageDTO retriveimage(ImageDTO img) {
	
		return null;
	}

	@Override
	public int countImage(Proxy pxy) {
	
		return 0;
	}

	@Override
	public void updateImage(ImageDTO img) {
	
		
	}

	@Override
	public void removeImage(ImageDTO img) {
	
		
	}

}
