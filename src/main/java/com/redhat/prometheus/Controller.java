package com.redhat.prometheus;

import org.springframework.web.bind.annotation.RestController;

import io.prometheus.client.GaugeMetricFamily;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Controller {

	@RequestMapping("/metrics")
	public String index() {
		GaugeMetricFamily gauge = new GaugeMetricFamily("consyss_custom_metric", "Sample Metric.  Goes from 0 to 1",
				0.6F);
		return gauge.toString();
	}

}
