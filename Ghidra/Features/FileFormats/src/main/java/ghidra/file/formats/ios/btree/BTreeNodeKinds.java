/* ###
 * IP: GHIDRA
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ghidra.file.formats.ios.btree;

/**
 * Represents kinds of BTNodeDescriptor.
 * 
 * @see <a href="https://opensource.apple.com/source/xnu/xnu-792/bsd/hfs/hfs_format.h.auto.html">hfs/hfs_format.h</a>
 * @see <a href="https://developer.apple.com/library/archive/technotes/tn/tn1150.html">B-Trees</a> 
 */
public final class BTreeNodeKinds {

	public final static byte  kBTLeafNode    =  -1;
	public final static byte  kBTIndexNode   =   0;
	public final static byte  kBTHeaderNode  =   1;
	public final static byte  kBTMapNode     =   2;

}
