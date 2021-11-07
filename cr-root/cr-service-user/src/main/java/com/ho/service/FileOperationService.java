package com.ho.service;

import org.springframework.web.multipart.MultipartFile;

public interface FileOperationService {

    void FileUpload(MultipartFile file);

    void FileDownload();

}
