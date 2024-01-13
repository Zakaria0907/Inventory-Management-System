//package com.zakaria.inventorymanagement.controller;
//
//import com.zakaria.inventorymanagement.dto.ClientDto;
//import com.zakaria.inventorymanagement.service.ClientService;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.List;
//
//@RestController
//public class ClientController  {
//
//	private ClientService clientService;
//
//	@Autowired
//	public ClientController(ClientService clientService) {
//		this.clientService = clientService;
//	}
//
//	@Override
//	public ClientDto save(ClientDto dto) {
//		return clientService.save(dto);
//	}
//
//	@Override
//	public ClientDto findById(Integer id) {
//		return clientService.findById(id);
//	}
//
//	@Override
//	public List<ClientDto> findAll() {
//		return clientService.findAll();
//	}
//
//	@Override
//	public void delete(Integer id) {
//		clientService.delete(id);
//	}
//}
