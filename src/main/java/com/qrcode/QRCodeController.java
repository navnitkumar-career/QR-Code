package com.qrcode;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QRCodeController {

	@GetMapping(value = "/genrateAndDownloadQRCode")
	public void download() throws Exception {
		QRCodeGenerator.generateQRCodeImage();
	}

	@GetMapping(value = "/genrateQRCode")
	public ResponseEntity<byte[]> generateQRCode() throws Exception {
		return ResponseEntity.status(HttpStatus.OK).body(QRCodeGenerator.getQRCodeImage());
	}

}


