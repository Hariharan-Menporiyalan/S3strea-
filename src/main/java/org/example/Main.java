package org.example;

import org.example.service.OfferReport;
import org.example.service.UploadToS3Impl;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        OfferReport offerReport = new OfferReport();
        offerReport.setCustomerId("cid");
        offerReport.setProductId("pid");
        offerReport.setErrorMsg("cus err msg");
        Map<String, List<OfferReport>> offerReportMap = Map.of("File1_direct_test",
                Collections.singletonList(offerReport));
        new UploadToS3Impl().writeAsStreamToS3(offerReportMap);

    }
}