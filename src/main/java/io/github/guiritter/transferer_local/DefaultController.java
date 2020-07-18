package io.github.guiritter.transferer_local;

import static org.springframework.http.MediaType.APPLICATION_OCTET_STREAM_VALUE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Value;
// import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

@RestController
@RequestMapping("api")
public class DefaultController {

	@Value("${fileName}")
	private String fileName;

	@Value("${filePath}")
	private String filePath;

	@GetMapping("download")
	public StreamingResponseBody downloadHub(HttpServletResponse response) throws IOException {
		File file = new File(filePath + fileName);
		response.setContentType(APPLICATION_OCTET_STREAM_VALUE);
		response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
		response.setHeader("Content-Length", file.length() + "");
		InputStream inputStream = new FileInputStream(file);
		return outputStream -> {
			int nRead;
			byte[] data = new byte[1024*1024];
			while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
				outputStream.write(data, 0, nRead);
			}
			inputStream.close();
		};
	}

	// @GetMapping("download")
	// public ResponseEntity<StreamingResponseBody> downloadHub(HttpServletResponse response) throws IOException {
	// 	File file = new File(filePath + fileName);
	// 	response.setContentType(APPLICATION_OCTET_STREAM_VALUE);
	// 	response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
	// 	response.setHeader("Content-Length", file.length() + "");
	// 	InputStream inputStream = new FileInputStream(file);

	// 	return ResponseEntity.ok(outputStream -> {
	// 		int nRead;
	// 		byte[] data = new byte[1024*1024];
	// 		while ((nRead = inputStream.read(data, 0, data.length)) != -1) {
	// 			outputStream.write(data, 0, nRead);
	// 		}
	// 		inputStream.close();
	// 	});
	// }
}
