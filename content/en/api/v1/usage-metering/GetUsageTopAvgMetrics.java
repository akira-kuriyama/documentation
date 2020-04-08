import com.datadog.api.v1.client.api.UsageMeteringApi;

public class UsageMeteringApiExample {

    public static void main(String[] args) {
        UsageMeteringApi apiInstance = new UsageMeteringApi();
        Date month = 2013-10-20T19:20:30+01:00; // Date | Datetime in ISO-8601 format, UTC, precise to month: [YYYY-MM] for usage beginning at this hour.
        array[String] names = ; // array[String] | Comma-separated list of metric names.
        try {
            UsageTopAvgMetricsResponse result = apiInstance.getUsageTopAvgMetrics(month, names);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsageMeteringApi#getUsageTopAvgMetrics");
            e.printStackTrace();
        }
    }
}