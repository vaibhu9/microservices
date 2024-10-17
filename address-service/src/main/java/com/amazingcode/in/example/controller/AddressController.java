package com.amazingcode.in.example.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amazingcode.in.example.entity.Address;
import com.amazingcode.in.example.service.AddressService;

@RestController
@RequestMapping("/api/addresses")
public class AddressController {
	
	private final AddressService addressService;
	
	public AddressController(AddressService addressService) {
		this.addressService = addressService;
	}
	
	@PostMapping
	ResponseEntity<Address> createAddress(@RequestBody Address address){
		return ResponseEntity.status(HttpStatus.CREATED).body(addressService.saveAddress(address));
	}
	
	@GetMapping
	public ResponseEntity<List<Address>> getAddresses() {
		return ResponseEntity.status(HttpStatus.OK).body(addressService.getAddresses());
	}
	
	@GetMapping("/{employeeId}")
	public ResponseEntity<Address> getAddress(@PathVariable("employeeId") Long employeeId){
		return ResponseEntity.status(HttpStatus.OK).body(addressService.getAddressByEmployeeId(employeeId));
	}
	
	@PutMapping("/{addressId}")
	public ResponseEntity<Address> updateAddress(@PathVariable Long addressId, @RequestBody Address address){
		return ResponseEntity.status(HttpStatus.OK).body(addressService.updateAddress(addressId, address));
	}
	
	@DeleteMapping("/{addressId}")
	public ResponseEntity<Void> deleteAddress(@PathVariable Long addressId){
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
