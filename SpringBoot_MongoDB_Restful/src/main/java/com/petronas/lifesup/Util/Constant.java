package com.petronas.lifesup.Util;

public class Constant {

    // hardcode String data để tránh chính sửa đường dẫn đặt file và String json ko dài quá . :D
    public static   String json ="[\n" +
            "    {\n" +
            "        \"idcampaign\":100000001,\n" +
            "        \"name\": \"Test Ad 1\",\n" +
            "        \"goal\": \"Increase Reach\",\n" +
            "        \"total_budget\": 120,\n" +
            "        \"status\":\"Delivering\",\n" +
            "        \"platforms\":{\n" +
            "            \"facebook\": {\n" +
            "                \"status\":\"Delivering\",\n" +
            "                \"total_budget\":40,\n" +
            "                \"remaining_budget\":12,\n" +
            "                \"start_date\":1530568800000,\n" +
            "                \"end_date\":1532901600000,\n" +
            "                \"target_audiance\":{\n" +
            "                    \"languages\":[\"FR\",\"EN\",\"DE\"],\n" +
            "                    \"genders\":[\"M\", \"F\"],\n" +
            "                    \"age_range\":[20, 66],\n" +
            "                    \"locations\":[\n" +
            "                        \"France\",\n" +
            "                        \"Germany\",\n" +
            "                        \"Switzerland\"\n" +
            "                    ],\n" +
            "                    \"interests\":[\n" +
            "                        \"Docker\",\n" +
            "                        \"Kubernates\",\n" +
            "                        \"DevOps\",\n" +
            "                        \"AWS\",\n" +
            "                        \"Google Cloud Platform\",\n" +
            "                        \"Ubuntu\"\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"creatives\":{\n" +
            "                    \"header\":\"DevOps Made Easy, We Take care of the heavy lifting for you\",\n" +
            "                    \"description\":\"DOP SuperHero is where all DevOps is going to happen in the future, join the revolution today!\",\n" +
            "                    \"url\":\"https://example.io\",\n" +
            "                    \"image\":\"img1.jpg\"\n" +
            "                },\n" +
            "                \"insights\":{\n" +
            "                    \"impressions\": 4503,\n" +
            "                    \"clicks\": 328,\n" +
            "                    \"nanos_score\": 5.7,\n" +
            "                    \"cost_per_click\": 0.88,\n" +
            "                    \"click_through_rate\": 0.09,\n" +
            "                    \"advanced_kpi_1\": 44.5,\n" +
            "                    \"advanced_kpi_2\": 0.0023\n" +
            "                }\n" +
            "            },\n" +
            "            \"instagram\": {\n" +
            "                \"status\":\"Delivering\",\n" +
            "                \"total_budget\":44,\n" +
            "                \"remaining_budget\":14,\n" +
            "                \"start_date\":1530568800000,\n" +
            "                \"end_date\":1532901600000,\n" +
            "                \"target_audiance\":{\n" +
            "                    \"languages\":[\"FR\",\"EN\",\"DE\"],\n" +
            "                    \"genders\":[\"M\", \"F\"],\n" +
            "                    \"age_range\":[20, 66],\n" +
            "                    \"locations\":[\n" +
            "                        \"France\",\n" +
            "                        \"Germany\",\n" +
            "                        \"Switzerland\"\n" +
            "                    ],\n" +
            "                    \"interests\":[\n" +
            "                        \"Docker\",\n" +
            "                        \"Kubernates\",\n" +
            "                        \"DevOps\",\n" +
            "                        \"AWS\",\n" +
            "                        \"Google Cloud Platform\",\n" +
            "                        \"Ubuntu\"\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"creatives\":{\n" +
            "                    \"header\":\"DevOps Made Easy, We Take care of the heavy lifting for you\",\n" +
            "                    \"description\":\"DOP SuperHero is where all DevOps is going to happen in the future, join the revolution today!\",\n" +
            "                    \"url\":\"https://example.io\",\n" +
            "                    \"image\":\"img1.jpg\"\n" +
            "                },\n" +
            "                \"insights\":{\n" +
            "                    \"impressions\": 436,\n" +
            "                    \"clicks\": 220,\n" +
            "                    \"website_visits\": 178,\n" +
            "                    \"nanos_score\": 5.2,\n" +
            "                    \"cost_per_click\": 1.28,\n" +
            "                    \"click_through_rate\": 0.43,\n" +
            "                    \"advanced_kpi_1\": 39,\n" +
            "                    \"advanced_kpi_2\": 0.00143\n" +
            "                }\n" +
            "            },\n" +
            "            \"google\": {\n" +
            "                \"status\":\"Delivering\",\n" +
            "                \"total_budget\":36,\n" +
            "                \"remaining_budget\":24,\n" +
            "                \"start_date\":1530568800000,\n" +
            "                \"end_date\":1532901600000,\n" +
            "                \"target_audiance\":{\n" +
            "                    \"languages\":[\"FR\",\"EN\",\"DE\"],\n" +
            "                    \"genders\":[\"M\", \"F\"],\n" +
            "                    \"age_range\":[20, 66],\n" +
            "                    \"locations\":[\n" +
            "                        \"France\",\n" +
            "                        \"Germany\",\n" +
            "                        \"Switzerland\",\n" +
            "                        \"Italy\",\n" +
            "                        \"Spain\",\n" +
            "                        \"Belgium\",\n" +
            "                        \"United Kingdom\",\n" +
            "                        \"Poland\"\n" +
            "                    ],\n" +
            "                    \"KeyWords\":[\n" +
            "                        \"Easy DevOps\",\n" +
            "                        \"DevOps As A Service\",\n" +
            "                        \"DevOps\",\n" +
            "                        \"AWS\",\n" +
            "                        \"Google Cloud Platform\",\n" +
            "                        \"DevOps Automation\",\n" +
            "                        \"One Click DevOps\",\n" +
            "                        \"NoOps\"\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"creatives\":{\n" +
            "                    \"header_1\":\"DevOps Made Easy\",\n" +
            "                    \"header_2\":\"We Take care of the heavy lifting for you\",\n" +
            "                    \"description\":\"DOP SuperHero is where all DevOps is going to happen in the future, join the revolution today!\",\n" +
            "                    \"url\":\"https://example.io\",\n" +
            "                    \"image\":\"img2.jpg\"\n" +
            "                },\n" +
            "                \"insights\":{\n" +
            "                    \"impressions\": 20436,\n" +
            "                    \"clicks\": 420,\n" +
            "                    \"website_visits\": 378,\n" +
            "                    \"cost_per_click\": 0.99,\n" +
            "                    \"click_through_rate\": 0.013,\n" +
            "                    \"advanced_kpi_1\": 3.9\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"idcampaign\":100000002,\n" +
            "        \"name\": \"Test Ad 2\",\n" +
            "        \"goal\": \"Raise Awareness\",\n" +
            "        \"total_budget\": 360,\n" +
            "        \"status\":\"Ended\",\n" +
            "        \"platforms\":{\n" +
            "            \"facebook\": {\n" +
            "                \"status\":\"Ended\",\n" +
            "                \"total_budget\":180,\n" +
            "                \"remaining_budget\":12,\n" +
            "                \"start_date\":1513724400000,\n" +
            "                \"end_date\":1514674800000,\n" +
            "                \"target_audiance\":{\n" +
            "                    \"languages\":[\"EN\"],\n" +
            "                    \"genders\":[\"M\", \"F\"],\n" +
            "                    \"age_range\":[20, 45],\n" +
            "                    \"locations\":[\n" +
            "                        \"Switzerland\"\n" +
            "                    ],\n" +
            "                    \"interests\":[\n" +
            "                        \"Docker\",\n" +
            "                        \"Kubernates\",\n" +
            "                        \"DevOps\",\n" +
            "                        \"AWS\",\n" +
            "                        \"Google Cloud Platform\",\n" +
            "                        \"Ubuntu\"\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"creatives\":{\n" +
            "                    \"header\":\"Tired of doing DevOps?\",\n" +
            "                    \"description\":\"Let us our smart AI DevOps Assistant help you!\",\n" +
            "                    \"url\":\"https://example.io\",\n" +
            "                    \"image\":\"img4.jpg\"\n" +
            "                },\n" +
            "                \"insights\":{\n" +
            "                    \"impressions\": 8293,\n" +
            "                    \"clicks\": 453,\n" +
            "                    \"nanos_score\": 2.9,\n" +
            "                    \"cost_per_click\": 2.88,\n" +
            "                    \"click_through_rate\": 0.003,\n" +
            "                    \"advanced_kpi_1\": 39.7,\n" +
            "                    \"advanced_kpi_2\": 0.035\n" +
            "                }\n" +
            "            },\n" +
            "            \"instagram\": {\n" +
            "                \"status\":\"Ended\",\n" +
            "                \"total_budget\":180,\n" +
            "                \"remaining_budget\":0,\n" +
            "                \"start_date\":1513724400000,\n" +
            "                \"end_date\":1514674800000,\n" +
            "                \"target_audiance\":{\n" +
            "                    \"languages\":[\"EN\"],\n" +
            "                    \"genders\":[\"M\", \"F\"],\n" +
            "                    \"age_range\":[20, 45],\n" +
            "                    \"locations\":[\n" +
            "                        \"Switzerland\"\n" +
            "                    ],\n" +
            "                    \"interests\":[\n" +
            "                        \"Docker\",\n" +
            "                        \"Kubernates\",\n" +
            "                        \"DevOps\",\n" +
            "                        \"AWS\",\n" +
            "                        \"Google Cloud Platform\",\n" +
            "                        \"Ubuntu\"\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"creatives\":{\n" +
            "                    \"header\":\"Tired of doing DevOps ?\",\n" +
            "                    \"description\":\"Let us our smart AI DevOps Assistant help you #AWS #GCP #DevOps #Docker #Kubernates\",\n" +
            "                    \"url\":\"https://example.io\",\n" +
            "                    \"image\":\"img3.jpg\"\n" +
            "                },\n" +
            "                \"insights\":{\n" +
            "                    \"impressions\": 9023,\n" +
            "                    \"clicks\": 1321,\n" +
            "                    \"website_visits\": 943,\n" +
            "                    \"nanos_score\": 8.2,\n" +
            "                    \"cost_per_click\": 4.28,\n" +
            "                    \"click_through_rate\": 0.043,\n" +
            "                    \"advanced_kpi_1\": 93,\n" +
            "                    \"advanced_kpi_2\": 0.08332\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    },\n" +
            "    {\n" +
            "        \"idcampaign\":100000003,\n" +
            "        \"name\": \"Test Ad 3\",\n" +
            "        \"goal\": \"Raise Awareness\",\n" +
            "        \"total_budget\": 90,\n" +
            "        \"status\":\"Scheduled\",\n" +
            "        \"platforms\":{\n" +
            "            \"facebook\": {\n" +
            "                \"status\":\"Scheduled\",\n" +
            "                \"total_budget\":40,\n" +
            "                \"remaining_budget\":40,\n" +
            "                \"start_date\":1532901600000,\n" +
            "                \"end_date\":1535580000000,\n" +
            "                \"target_audiance\":{\n" +
            "                    \"languages\":[\"EN\"],\n" +
            "                    \"genders\":[\"M\", \"F\"],\n" +
            "                    \"age_range\":[20, 65],\n" +
            "                    \"locations\":[\n" +
            "                        \"Switzerland\"\n" +
            "                    ],\n" +
            "                    \"interests\":[\n" +
            "                        \"Software Development\",\n" +
            "                        \"React Native\",\n" +
            "                        \"Angular\",\n" +
            "                        \"React\",\n" +
            "                        \"VueJS\",\n" +
            "                        \"Frontend Development\"\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"creatives\":{\n" +
            "                    \"header\":\"Need Help?\",\n" +
            "                    \"description\":\"Let us take care of your frontend needs today!\",\n" +
            "                    \"url\":\"https://example.io\",\n" +
            "                    \"image\":\"img4.jpg\"\n" +
            "                },\n" +
            "                \"insights\":{\n" +
            "                    \"impressions\": 0,\n" +
            "                    \"clicks\": 0,\n" +
            "                    \"nanos_score\": 5.9,\n" +
            "                    \"cost_per_click\": 0,\n" +
            "                    \"click_through_rate\": 0,\n" +
            "                    \"advanced_kpi_1\": 0,\n" +
            "                    \"advanced_kpi_2\": 0\n" +
            "                }\n" +
            "            },\n" +
            "            \"instagram\": {\n" +
            "                \"status\":\"Scheduled\",\n" +
            "                \"total_budget\":50,\n" +
            "                \"remaining_budget\":40,\n" +
            "                \"start_date\":1532901600000,\n" +
            "                \"end_date\":1535580000000,\n" +
            "                \"target_audiance\":{\n" +
            "                    \"languages\":[\"EN\"],\n" +
            "                    \"genders\":[\"M\", \"F\"],\n" +
            "                    \"age_range\":[20, 45],\n" +
            "                    \"locations\":[\n" +
            "                        \"Switzerland\"\n" +
            "                    ],\n" +
            "                    \"interests\":[\n" +
            "                        \"Software Development\",\n" +
            "                        \"React Native\",\n" +
            "                        \"Angular\",\n" +
            "                        \"React\",\n" +
            "                        \"VueJS\",\n" +
            "                        \"Frontend Development\",\n" +
            "                        \"NodeJS\",\n" +
            "                        \"Facebook Developer\",\n" +
            "                        \"Wordpress\"\n" +
            "                    ]\n" +
            "                },\n" +
            "                \"creatives\":{\n" +
            "                    \"header\":\"Need Help?\",\n" +
            "                    \"description\":\"Let us take care of your frontend needs today! #Angular #React #React_native #VueJS #VueIsAwesome, #ReactForever #ILoveAngular #Frontend #Javascript\",\n" +
            "                    \"url\":\"https://example.io\",\n" +
            "                    \"image\":\"img4.jpg\"\n" +
            "                },\n" +
            "                \"insights\":{\n" +
            "                    \"impressions\": 0,\n" +
            "                    \"clicks\": 0,\n" +
            "                    \"website_visits\": 0,\n" +
            "                    \"nanos_score\": 8.2,\n" +
            "                    \"cost_per_click\": 0,\n" +
            "                    \"click_through_rate\": 0,\n" +
            "                    \"advanced_kpi_1\": 0,\n" +
            "                    \"advanced_kpi_2\": 0\n" +
            "                }\n" +
            "            }\n" +
            "        }\n" +
            "    }\n" +
            "]\n";
}
