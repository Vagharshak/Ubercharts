/*
 Copyright 2011 comSysto GmbH

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */

package com.comsysto.insight.model.options;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: elbatya
 * Date: 18/03/2011
 * Time: 15:02
 * To change this template use File | Settings | File Templates.
 */
public class ExportingButtons implements Serializable {

    private ExportButton mExportButton;
    private PrintButton mPrintButton;


    public ExportButton getExportButton() {
        return mExportButton;
    }

    public ExportingButtons setExportButton(ExportButton pExportButton) {
        mExportButton = pExportButton;
        return this;
    }

    public PrintButton getPrintButton() {
        return mPrintButton;
    }

    public ExportingButtons setPrintButton(PrintButton pPrintButton) {
        mPrintButton = pPrintButton;
        return this;
    }
}