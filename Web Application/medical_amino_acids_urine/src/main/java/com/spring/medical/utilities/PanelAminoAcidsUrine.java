package com.spring.medical.utilities;

import java.util.ArrayList;
import java.util.List;

import com.spring.medical.model.Exam;

/**
 * @author GTST - Grupo de tratamiento de señales y telecomunicaciones -
 *         Universidad Surcolombiana
 *
 */

public class PanelAminoAcidsUrine {

	/**
	 * 
	 * @param exam
	 *            - exam object
	 * @return -
	 */
	public Exam getExam(Exam exam) {

		switch (exam.getCode()) {
		case "28588-2":
			exam.setDisplayCode("Beta alanine/Creatinine [Ratio] in Urine");
			exam.setCode("28588-2");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28588-2.html?sections=Comprehensive");
			exam.setUnit("meq/g{creat}");
			break;
		case "30068-1":
			exam.setDisplayCode("Alanine/Creatinine [Ratio] in Urine");
			exam.setCode("30068-1");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30068-1.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28598-1":
			exam.setDisplayCode("Alpha aminoadipate/Creatinine [Ratio] in Urine");
			exam.setCode("28598-1");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28598-1.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28591-6":
			exam.setDisplayCode("Amino beta guanidinopropionate/Creatinine [Ratio] in Urine");
			exam.setCode("28591-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28591-6.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28593-2":
			exam.setDisplayCode("Gamma aminobutyrate/Creatinine [Ratio] in Urine");
			exam.setCode("28593-2");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28593-2.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28602-1":
			exam.setDisplayCode("Beta aminoisobutyrate/Creatinine [Ratio] in Urine");
			exam.setCode("28602-1");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28602-1.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28590-8":
			exam.setDisplayCode("Alpha aminobutyrate/Creatinine [Ratio] in Urine");
			exam.setCode("28590-8");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28590-8.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28596-5":
			exam.setDisplayCode("Anserine/Creatinine [Ratio] in Urine");
			exam.setCode("28596-5");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28596-5.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30062-4":
			exam.setDisplayCode("Arginine/Creatinine [Ratio] in Urine");
			exam.setCode("30062-4");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30062-4.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28603-9":
			exam.setDisplayCode("AsparagineCreatinine [Ratio] in Urine");
			exam.setCode("28603-9");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28603-9.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30061-6":
			exam.setDisplayCode("Aspartate/Creatinine [Ratio] in Urine");
			exam.setCode("30061-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30061-6.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28597-3":
			exam.setDisplayCode("CarnosineCreatinine [Ratio] in Urine");
			exam.setCode("28597-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28597-3.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30161-4":
			exam.setDisplayCode("Citrulline/Creatinine [Ratio] in Urine");
			exam.setCode("30161-4");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30161-4.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28599-9":
			exam.setDisplayCode("Cystathionine/Creatinine [Ratio] in Urine");
			exam.setCode("28599-9");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28599-9.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30065-7":
			exam.setDisplayCode("Cystine/Creatinine [Ratio] in Urine");
			exam.setCode("30065-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30065-7.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30059-0":
			exam.setDisplayCode("Glutamate/Creatinine [Ratio] in Urine");
			exam.setCode("30059-0");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30059-0.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30056-6":
			exam.setDisplayCode("Glutamine/Creatinine [Ratio] in Urine");
			exam.setCode("30056-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30056-6.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30066-5":
			exam.setDisplayCode("Glycine/Creatinine [Ratio] in Urine");
			exam.setCode("30066-5");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30066-5.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30047-5":
			exam.setDisplayCode("Histidine/Creatinine [Ratio] in Urine");
			exam.setCode("30047-5");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30047-5.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30051-7":
			exam.setDisplayCode("Homocystine/Creatinine [Ratio] in Urine");
			exam.setCode("30051-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30051-7.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30050-9":
			exam.setDisplayCode("Hydroxylysine/Creatinine [Ratio] in Urine");
			exam.setCode("30050-9");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30050-9.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28601-3":
			exam.setDisplayCode("Hydroxyproline/Creatinine [Ratio] in Urine");
			exam.setCode("28601-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28601-3.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30052-5":
			exam.setDisplayCode("Isoleucine/Creatinine [Ratio] in Urine");
			exam.setCode("30052-5");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30052-5.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30053-3":
			exam.setDisplayCode("Leucine/Creatinine [Ratio] in Urine");
			exam.setCode("30053-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30053-3.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30048-3":
			exam.setDisplayCode("Lysine/Creatinine [Ratio] in Urine");
			exam.setCode("30048-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30048-3.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30063-2":
			exam.setDisplayCode("Methionine/Creatinine [Ratio] in Urine");
			exam.setCode("30063-2");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30063-2.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28606-2":
			exam.setDisplayCode("1-Methylhistidine/Creatinine [Ratio] in Urine");
			exam.setCode("28606-2");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28606-2.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28594-0":
			exam.setDisplayCode("3-Methylhistidine/Creatinine [Ratio] in Urine");
			exam.setCode("28594-0");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28594-0.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30049-1":
			exam.setDisplayCode("Ornithine/Creatinine [Ratio] in Urine");
			exam.setCode("30049-1");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30049-1.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30055-8":
			exam.setDisplayCode("Phenylalanine/Creatinine [Ratio] in Urine");
			exam.setCode("30055-8");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30055-8.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28604-7":
			exam.setDisplayCode("Phosphoethanolamine/Creatinine [Ratio] in Urine");
			exam.setCode("28604-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28604-7.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28600-5":
			exam.setDisplayCode("Phosphoserine/Creatinine [Ratio] in Urine");
			exam.setCode("28600-5");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28600-5.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30067-3":
			exam.setDisplayCode("Proline/Creatinine [Ratio] in Urine");
			exam.setCode("30067-3");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30067-3.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28610-4":
			exam.setDisplayCode("Sarcosine/Creatinine [Ratio] in Urine");
			exam.setCode("28610-4");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28610-4.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30058-2":
			exam.setDisplayCode("Serine/Creatinine [Ratio] in Urine");
			exam.setCode("30058-2");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30058-2.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28595-7":
			exam.setDisplayCode("Taurine/Creatinine [Ratio] in Urine");
			exam.setCode("28595-7");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28595-7.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30057-4":
			exam.setDisplayCode("Threonine/Creatinine [Ratio] in Urine");
			exam.setCode("30057-4");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30057-4.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "28608-8":
			exam.setDisplayCode("Tryptophan/Creatinine [Ratio] in Urine");
			exam.setCode("28608-8");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/28608-8.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30054-1":
			exam.setDisplayCode("Tyrosine/Creatinine [Ratio] in Urine");
			exam.setCode("30054-1");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30054-1.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "30064-0":
			exam.setDisplayCode("Valine/Creatinine [Ratio] in Urine");
			exam.setCode("30064-0");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/30064-0.html?sections=Comprehensive");
			exam.setUnit("umol/g{creat}");
			break;
		case "32296-6":
			exam.setDisplayCode("Amino acid pattern [Interpretation] in Urine");
			exam.setCode("32296-6");
			exam.setSystemCode("http://r.details.loinc.org/LOINC/32296-6.html?sections=Comprehensive");
			break;

		}
		return exam;
	}

	/**
	 * 
	 * @return exam list name
	 */
	public List<String> listExam() {
		List<String> listExam = new ArrayList<>();
		listExam.add("28588-2");
		listExam.add("30068-1");
		listExam.add("28598-1");
		listExam.add("28591-6");
		listExam.add("28593-2");
		listExam.add("28602-1");
		listExam.add("28590-8");
		listExam.add("28596-5");
		listExam.add("30062-4");
		listExam.add("28603-9");
		listExam.add("30061-6");
		listExam.add("28597-3");
		listExam.add("30161-4");
		listExam.add("28599-9");
		listExam.add("30065-7");
		listExam.add("30059-0");
		listExam.add("30056-6");
		listExam.add("30066-5");
		listExam.add("30047-5");
		listExam.add("30051-7");
		listExam.add("30050-9");
		listExam.add("28601-3");
		listExam.add("30052-5");
		listExam.add("30053-3");
		listExam.add("30048-3");
		listExam.add("30063-2");
		listExam.add("28606-2");
		listExam.add("28594-0");
		listExam.add("30049-1");
		listExam.add("30055-8");
		listExam.add("28604-7");
		listExam.add("28600-5");
		listExam.add("30067-3");
		listExam.add("28610-4");
		listExam.add("30058-2");
		listExam.add("28595-7");
		listExam.add("30057-4");
		listExam.add("28608-8");
		listExam.add("30054-1");
		listExam.add("30064-0");
		listExam.add("32296-6");

		return listExam;
	}
}
