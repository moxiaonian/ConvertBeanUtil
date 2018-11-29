package test;

import util.ConvertBeanUtil;

public class TestConvertBean {

	public static void main(String[] args) {
		BeanA a = new BeanA();
		a.setAge(11);
		a.setAmount(22d);
		a.setName("look");
		
		BeanB b = (BeanB)ConvertBeanUtil.convert(a, BeanB.class);
		System.out.println("BeanB{name:"+b.getName()+",age:"+b.getAge()+",amount:"+b.getAmount()+",level:"+b.getLevel()+"}");
		
	}
}
