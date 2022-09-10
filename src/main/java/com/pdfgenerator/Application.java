package com.pdfgenerator;

import com.pdfgenerator.util.PDFGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {

        ApplicationContext ac = SpringApplication.run(Application.class, args);

        PDFGenerator pDFGenerator = ac.getBean("pdfGenerator", PDFGenerator.class);

        pDFGenerator.generatePdfReport();
    }
}
