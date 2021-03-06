/*
 * Copyright (c) 2019 gomyck
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

package com.gomyck.fastdfs.starter.database.entity;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gomyck QQ:474798383
 * @version [1.0]
 * @since [2019-08-06]
 */
@Data
public class BatchDownLoadParameter {

    private List<FileBatchDownload> files = new ArrayList<>();

    @Data
    public static class FileBatchDownload{
        private String fileMd5 = ""; //文件摘要

        private String zipSrc = ""; //在压缩包中的目录

        private String fileName = ""; //文件名, 可以为空, 空时取原始文件名
    }

}
