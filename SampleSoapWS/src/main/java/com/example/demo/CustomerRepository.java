package com.example.demo;


import org.springframework.stereotype.Component;

/*
    Sembolik repository sınıfı. Bu bileşeni Service Endpoint sınıfı kullanıyor.
*/
@Component
public class CustomerRepository {

    /*
     * Servisin sunduğu fonksiyonelliklerden birisi belli bir bölge için müşteri
     * segmentine göre istatistiki bilgi döndürmek.
     * 
     * UsageSummary ve Size tipleri tahmin edeceğiniz üzere XSD'den otomatik
     * üretilen JAXB türleri.
     */
    public UsageSummary GetSummaryByRegion(String region, Size size) {
        UsageSummary summary = new UsageSummary();

        summary.setAvgCustomerSatisfaction(76.50F);
        summary.setNumberOfRepresentetive(12);
        summary.setTotalTransactionVolume(15000000.99F);
        summary.setSize(size);
        summary.setEvaluation("Daha agresit satış stratejilerine ihtiyacımız var");

        return summary;
    }
}