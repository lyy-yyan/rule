package org.rule.data;

import java.io.IOException;
import org.nustaq.serialization.FSTConfiguration;

/**
 * @author Liu Yuyan
 */
public class RuleContentToFst {
    public static void main(String[] args) throws IOException {
        // 获取 FSTConfiguration 实例
        FSTConfiguration conf = FSTConfiguration.createDefaultConfiguration();
        // 从数据库中获取 rule_content 字段的值
        String ruleContent = "rule \"test rule\"\nwhen\n    $order: Order(amount > 100)\nthen\n    $order.setDiscount(0.1);\nend";
        // 将 rule_content 转换成 FST 数据结构
        byte[] ruleContentBytes = conf.asByteArray(ruleContent);
        // 输出 FST 数据结构
        System.out.println("FST data structure: " + ruleContentBytes);
    }
}