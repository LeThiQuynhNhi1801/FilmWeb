//package film.api.controller;
//
//import film.api.service.FileService;
//import jakarta.annotation.Resource;
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.MediaType;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.annotation.Secured;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/ApiV1")
//@Slf4j
//@CrossOrigin("*")
//public class FileController {
//    @Autowired
//    private FileService fileService;
//    @Secured({"ROLE_ADMIN","ROLE_USER"})
//    @GetMapping("/photo/{fileName:.+}")
//    public ResponseEntity<?> getPhoto(@PathVariable String fileName) {
//        Resource file = fileService.loadAsResource(fileName);
//
//        return ResponseEntity.ok()
//                .contentType(MediaType.IMAGE_JPEG) // Đổi kiểu MIME tùy thuộc vào loại file
//                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + file.getFilename() + "\"")
//                .body(file);
//    }
//
//}
