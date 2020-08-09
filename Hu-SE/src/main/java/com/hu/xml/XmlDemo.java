package com.hu.xml;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.Node;
import org.dom4j.io.SAXReader;

import java.util.List;

/**
 * @author huxiongjun
 */
public class XmlDemo {
    public static void main(String[] args) throws Exception {
        SAXReader reader = new SAXReader();
        Document document = reader.read(XmlDemo.class.getResourceAsStream("/book.xml"));

        //获取id为0002的指定book元素的子标签name的内容
        Element ele = (Element)document.selectSingleNode("//book[@id='0002']/name");
        System.out.println(ele.getText());
    }
}
