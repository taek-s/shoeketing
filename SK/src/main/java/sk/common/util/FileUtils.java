package sk.common.util;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class FileUtils {
	// 브랜드 기본 정보 로고 파일 수정
	public List<Map<String, Object>> parseUpdateFileInfo(Map<String, Object> map, MultipartHttpServletRequest request)
			throws Exception {
//		String filePath_temp = request.getServletContext().getRealPath("/resources/uploadImage/");
		String filePath_temp = "C:\\uploadImage\\"; // 로컬 경로에 업로드

		System.out.println(filePath_temp);

		MultipartFile multipartFile = request.getFile((String) map.get("BRAND_LOGO_FILE"));
		String originalFileName = null;
		String originalFileExtension = null;
		String storedFileName = null;
		File file = new File(filePath_temp);

		if (file.exists() == false) {
			file.mkdirs();
		}
		
		// 참고해서 로직 작성필요
//		if (multipartFile.isEmpty() == false) {
//			originalFileName = multipartFile.getOriginalFilename();
//			originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
//			storedFileName = CommonUtils.getRandomString() + originalFileExtension;
//			file = new File(filePath_temp + storedFileName);
//			multipartFile.transferTo(file);
//			listMap = new HashMap<String, Object>();
//
//			
//			listMap.put("BRAND_LOGO_FILE", storedFileName);
//			listMap.put("FILES_SIZE", multipartFile.getSize());
//			list.add(listMap);
//		}
		

//		while (iterator.hasNext()) {
//			multipartFile = multipartHttpServletRequest.getFile(iterator.next());
//
//			if (multipartFile.isEmpty() == false) {
//				originalFileName = multipartFile.getOriginalFilename();
//				originalFileExtension = originalFileName.substring(originalFileName.lastIndexOf("."));
//				storedFileName = CommonUtils.getRandomString() + originalFileExtension;
//				file = new File(filePath_temp + storedFileName);
//				multipartFile.transferTo(file);
//				listMap = new HashMap<String, Object>();
//
//				listMap.put("BRAND_LOGO_FILE", storedFileName);
//				listMap.put("FILES_SIZE", multipartFile.getSize());
//				list.add(listMap);
//			}
//		}
		
		List<Map<String, Object>> list = new ArrayList<>();  //임시
		return list;
	}
}
