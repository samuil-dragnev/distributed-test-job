/**
 * The MIT License (MIT)
 * 
 * Copyright (c) 2015 Bombardier, Bombardier Transportation SE
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.bombardier.plugin.statistics;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Used as a container for the collected test case results.
 * @author <a href="mailto:samuil.dragnev@gmail.com">Samuil Dragnev</a>
 * @since 1.0
 */

@XmlRootElement(name = "testsuite")
@XmlAccessorType(XmlAccessType.FIELD)
public class TestSuite {

	@XmlAttribute(name = "name")
	private String name;

	@XmlElement(name = "testcase")
	private List<Result> testsResult;

	public List<Result> getTestcases() {
		return testsResult;
	}

	public void setTestcases(List<Result> testcases) {
		this.testsResult = testcases;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}