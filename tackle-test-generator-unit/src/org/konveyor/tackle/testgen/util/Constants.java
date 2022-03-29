/*
Copyright IBM Corporation 2021

Licensed under the Eclipse Public License 2.0, Version 2.0 (the "License");
you may not use this file except in compliance with the License.

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.konveyor.tackle.testgen.util;

public class Constants {

    /** Top-level directory under which JUnit test classes containing amplified
     * test cases are created; the test cases are grouped in dsub-directories corresponding
     * to partitions. */
    public static final String AMPLIFIED_TEST_CLASSES_OUTDIR = "ctd-amplified-tests";

    /** Suffix of file name to which CTD writes models and test plans for proxy methods.
     * The application name is added at the beginning of the file name */

    public static final String CTD_OUTFILE_SUFFIX = "ctd_models_and_test_plans.json";

    /** Suffix of file name to which CTD writes methods that it is not targeting for various reasons.
     * Currently all non-public methods are not targeted
     * The application name is added at the beginning of the file name */

    public static final String CTD_NON_TARGETED_OUTFILE_SUFFIX = "ctd_non_targeted_methods.json";

    /** Suffix of file name to which CTD writes RTA results.
     * The application name is added at the beginning of the file name */

    public static final String RTA_OUTFILE_SUFFIX = "RTA_output.json";

    /** Suffix of file name to which test sequences with embedded assertions are written.
     * The application name is added at the beginning of the file name */

    public static final String DIFF_ASSERTIONS_OUTFILE_SUFFIX = "sequences_with_assertions.json";

    /** Suffix of file name to which the results of executing the sequences are written along with the sequences ids.
     * The application name is added at the beginning of the file name */

    public static final String EXECUTOR_OUTFILE_SUFFIX = "sequences_results.json";

    /** Suffix of file name to which the initial basic block sequences generated by the test generator are written.
     * The application name is added at the beginning of the file name */

    public static final String INITIALIZER_OUTPUT_FILE_NAME_SUFFIX = "bb_test_sequences.json";

    /**
     * Coverage attained for a test plan row:
     *      COVERED: fully covered
     *      PARTIAL: some parameter types (list, array types) are partially covered
     *      COVERED_JEE: fully covered after adding JEE support (no diff assertions can be added to
     *      the corresponding sequence)
     *      PARTIAL_JEE: some parameter types (list, array types) are partially covered with JEE support
     *      UNCOVERED_NO_INIT_SEQ: not covered because no initial sequence covers the target method
     *      UNCOVERED_NON_INST_TYPE: not covered because a type specified in the test plan row could
     *          not be instantiated
     *      UNCOVERED_EXEC_FAIL: not covered because execution of extended sequence failed
     *      UNCOVERED_EXCP: not covered because exception thrown during sequence extension
     *      UNCOVERED: not covered for other reasons
     */
    public enum TestPlanRowCoverage {
        COVERED,
        PARTIAL,
        COVERED_JEE,
        PARTIAL_JEE,
        UNCOVERED_NO_INIT_SEQ,
        UNCOVERED_NON_INST_TYPE,
        UNCOVERED_EXEC_FAIL,
        UNCOVERED_EXCP,
        UNCOVERED
    }

    /**
     * Name of JSON file to which coverage information is written to
     */
    public static final String COVERAGE_FILE_JSON_SUFFIX = "_coverage_report.json";

    /** Name of JSON file to which extender summary information is written */
    public static final String EXTENDER_SUMMARY_FILE_JSON_SUFFIX = "_test_generation_summary.json";
    
    /** Name of JSON file to which extender CTD coverage is written */
    public static final String CTD_COVERAGE_FILE_JSON_SUFFIX = "_ctd_coverage_report.json";

    /** Name of JSON file to which information about sequence parse errors is written */
    public static final String SEQUENCE_PARSE_ERRORS_FILE_JSON_SUFFIX = "_base_sequence_parse_errors.json";

    /** Minimum number of passing test executions for a test to be considered a non-flaky
     * passing test */
//    public static final int MIN_TEST_EXECUTIONS_NONFLAKY = 1;

    /** Number of times to execute each sequence to identify and eliminate random recorded values */
    public static final int NUM_SEQUENCE_EXECUTION = 10;

    /** Maximum recursive depth for generation of constructor sequences */
    public static final int CONSTRUCTOR_SEQUENCE_GEN_MAX_DEPTH = 3;

    /** Name of test generator indicating invocation of all known test generators in concert */

    public static final String COMBINED_TEST_GENERATOR_NAME = "CombinedTestGenerator";

    /** Constants for EvoSuite Scaffolding method names */

    public static final String EVOSUITE_BEFORE_CLASS_METHOD = "initEvoSuiteFramework";

    public static final String EVOSUITE_AFTER_CLASS_METHOD = "clearEvoSuiteFramework";

    public static final String EVOSUITE_BEFORE_TEST_METHOD = "initTestCase";

    public static final String EVOSUITE_AFTER_TEST_METHOD = "doneWithTestCase";

    public final static String JAVA_FILE_SUFFIX = ".java";

    public static final String EVOSUITE_HELP_CLASS_SUFFIX = "_ESTest_scaffolding";

    public static final String EVOSUITE_HELP_FILE_SUFFIX = EVOSUITE_HELP_CLASS_SUFFIX+JAVA_FILE_SUFFIX;
    
    public static final String EVOSUITE_OUTPUT_DIR_NAME_SUFFIX = "-evosuite-tests";
    
    public static final String EVOSUITE_TARGET_DIR_NAME_SUFFIX = "-evosuite-targets";
    
    public static final String EVOSUITE_APP_COPY_DIR_NAME_SUFFIX = "-evosuite-app-copy";

    /** Java classes to be excluded from coverage target list - contain only package info */

    public static final String EXCLUDED_TARGET_CLASS_SUFFIX = "package-info.class";

    /** Randoop used version **/

    public static final String RANDOOP_VERSION = "4.3.0";

    /** Evosuite used version **/

    public static final String EVOSUITE_VERSION = "1.2.0";
    public static final String EVOSUITE_MASTER_JAR_NAME = "evosuite-"+ EVOSUITE_VERSION+".jar";
    public static final String EVOSUITE_RUNTIME_JAR_NAME = "evosuite-standalone-runtime-"+ EVOSUITE_VERSION+".jar";
    public static final String CCM_JAR_NAME = "ccmcl.jar";

	public static final String LIST_TAG = "_list";

	public static final String MAP_KEY_TAG = "_key";

	public static final String MAP_VALUE_TAG = "_value";

}
